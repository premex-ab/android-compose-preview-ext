package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PicassoTab device specifications for Android Compose previews.
 *
 * This extension provides PicassoTab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PicassoTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PicassoTab: Any
  get() = object {
      /** PicassoTab A10 */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** PicassoTab PicassoTab_X11_2025 */
      val PICASSOTAB_X11_2025 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** PicassoTab X11 */
      val X11 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
