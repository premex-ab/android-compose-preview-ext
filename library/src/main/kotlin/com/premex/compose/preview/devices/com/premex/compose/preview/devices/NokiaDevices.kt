package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOKIA device specifications for Android Compose previews.
 *
 * This extension provides NOKIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nokia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nokia: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOKIA, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOKIA, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NOKIA, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOKIA, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NOKIA, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOKIA, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOKIA, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOKIA, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
