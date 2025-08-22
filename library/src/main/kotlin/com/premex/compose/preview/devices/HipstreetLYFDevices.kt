package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hipstreet-LYF device specifications for Android Compose previews.
 *
 * This extension provides Hipstreet-LYF device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HipstreetLYF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HipstreetLYF: Any
  get() = object {
      /** Hipstreet-LYF LS-4004 */
      val LS_4004 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Hipstreet-LYF LS-5017 */
      val LS_5017 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
