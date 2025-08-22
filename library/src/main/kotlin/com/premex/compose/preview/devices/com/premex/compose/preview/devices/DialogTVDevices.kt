package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dialog_TV device specifications for Android Compose previews.
 *
 * This extension provides Dialog_TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DialogTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DialogTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dialog_TV, code=DV6067H-Dialog, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialog_TV, code=DV6067H-Dialog,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val DV6067H_DIALOG = "spec:width=720,height=1280,unit=px,dpi=213"

  }
