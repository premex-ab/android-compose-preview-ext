package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TrueIDTV device specifications for Android Compose previews.
 *
 * This extension provides TrueIDTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TrueIDTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TrueIDTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=TrueIDTV, code=HP4CE-Truevisions, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TrueIDTV, code=HP4CE-Truevisions,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HP4CE_TRUEVISIONS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TrueIDTV, code=SEI600TID, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TrueIDTV, code=SEI600TID,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI600TID = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
