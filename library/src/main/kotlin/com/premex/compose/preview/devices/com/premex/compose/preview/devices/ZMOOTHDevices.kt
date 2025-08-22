package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZMOOTH device specifications for Android Compose previews.
 *
 * This extension provides ZMOOTH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZMOOTH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZMOOTH: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZMOOTH, code=Zkai-study-Tab, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZMOOTH, code=Zkai-study-Tab,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val ZKAI_STUDY_TAB = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
