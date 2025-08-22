package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PTCLSHOQTV device specifications for Android Compose previews.
 *
 * This extension provides PTCLSHOQTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PTCLSHOQTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PTCLSHOQTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=PTCLSHOQTV, code=PTCLBox_B866V2F, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PTCLSHOQTV, code=PTCLBox_B866V2F,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val PTCLBOX_B866V2F = "spec:width=720,height=1280,unit=px,dpi=213"

  }
