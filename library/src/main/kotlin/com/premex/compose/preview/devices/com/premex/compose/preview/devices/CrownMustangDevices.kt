package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CrownMustang device specifications for Android Compose previews.
 *
 * This extension provides CrownMustang device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CrownMustang.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CrownMustang: Any
  get() = object {
      /** DeviceSpec(manufacturer=CrownMustang, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CrownMustang, code=martin,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CrownMustang, code=patrick, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CrownMustang, code=patrick,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
