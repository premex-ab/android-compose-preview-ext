package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ethiotelecom device specifications for Android Compose previews.
 *
 * This extension provides ethiotelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ethiotelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ethiotelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=ethiotelecom, code=ET_B866W11A, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ethiotelecom, code=ET_B866W11A,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val ET_B866W11A = "spec:width=720,height=1280,unit=px,dpi=213"

  }
