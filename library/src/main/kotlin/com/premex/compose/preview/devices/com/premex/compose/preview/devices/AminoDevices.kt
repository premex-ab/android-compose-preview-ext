package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amino device specifications for Android Compose previews.
 *
 * This extension provides Amino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amino: Any
  get() = object {
      /** DeviceSpec(manufacturer=Amino, code=Amigo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7x, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7x, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7x3SBC, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7x3SBC,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7X3SBC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7xcCN, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7xcCN, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7XCCN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7xESP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7xESP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7XESP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7xGM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7xGM, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7XGM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7xSCB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7xSCB, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AMIGO7XSCB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Amino, code=Amigo7Y, width=480, height=720, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amino, code=Amigo7Y, width=480,
      height=720, dpi=320, isGoogleDevice=false).code */
      val AMIGO7Y = "spec:width=480,height=720,unit=px,dpi=320"

  }
