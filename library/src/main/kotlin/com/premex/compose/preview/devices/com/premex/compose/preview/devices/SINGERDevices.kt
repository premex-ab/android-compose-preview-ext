package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SINGER device specifications for Android Compose previews.
 *
 * This extension provides SINGER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SINGER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SINGER: Any
  get() = object {
      /** DeviceSpec(manufacturer=SINGER, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SINGER, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SINGER, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SINGER, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SINGER, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SINGER, code=R4_GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=R4_GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SINGER, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=sunnyvale, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SINGER, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SINGER, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SINGER, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
