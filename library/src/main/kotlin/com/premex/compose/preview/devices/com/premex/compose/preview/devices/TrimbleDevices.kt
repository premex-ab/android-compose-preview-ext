package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Trimble device specifications for Android Compose previews.
 *
 * This extension provides Trimble device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trimble.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trimble: Any
  get() = object {
      /** DeviceSpec(manufacturer=Trimble, code=bcat, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=bcat, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BCAT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trimble, code=E7167, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=E7167, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E7167 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trimble, code=EE773X_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=EE773X_4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EE773X_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trimble, code=EE773X_WiFi, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=EE773X_WiFi,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EE773X_WIFI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trimble, code=pdog, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=pdog, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PDOG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trimble, code=TDC6, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=TDC6, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val TDC6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trimble, code=TDC600_2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trimble, code=TDC600_2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TDC600_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
