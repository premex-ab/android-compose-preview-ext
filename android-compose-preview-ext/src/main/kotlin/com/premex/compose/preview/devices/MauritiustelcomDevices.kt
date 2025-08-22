package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MauritiusTelcom device specifications for Android Compose previews.
 *
 * This extension provides MauritiusTelcom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mauritiustelcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mauritiustelcom: Any
  get() = object {
      /** MauritiusTelcom MTIPTVBox */
      val MTIPTVBOX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
