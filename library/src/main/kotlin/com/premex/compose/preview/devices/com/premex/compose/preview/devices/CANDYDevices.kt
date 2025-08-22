package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CANDY device specifications for Android Compose previews.
 *
 * This extension provides CANDY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CANDY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CANDY: Any
  get() = object {
      /** DeviceSpec(manufacturer=CANDY, code=broadway, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CANDY, code=broadway, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BROADWAY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CANDY, code=dupont, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CANDY, code=dupont, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DUPONT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CANDY, code=hanyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CANDY, code=hanyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CANDY, code=jordan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CANDY, code=jordan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JORDAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CANDY, code=nippori, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CANDY, code=nippori, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
