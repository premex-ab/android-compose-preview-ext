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
      /** Dialog_TV DV6067H-Dialog */
      val DV6067H_DIALOG = "spec:width=720,height=1280,unit=px,dpi=213"

  }
