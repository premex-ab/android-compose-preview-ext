package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ESLEY device specifications for Android Compose previews.
 *
 * This extension provides ESLEY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ESLEY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ESLEY: Any
  get() = object {
      /** DeviceSpec(manufacturer=ESLEY, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ESLEY, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ESLEY, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ESLEY, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
