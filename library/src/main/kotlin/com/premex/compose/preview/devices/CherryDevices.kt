package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cherry device specifications for Android Compose previews.
 *
 * This extension provides Cherry device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cherry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cherry: Any
  get() = object {
      /** Cherry Cherry_Aqua_Tab_S1 */
      val CHERRY_AQUA_TAB_S1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Cherry Cherry_Comet */
      val CHERRY_COMET = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Cherry Cherry_Magnum_8s */
      val CHERRY_MAGNUM_8S = "spec:width=800,height=1280,unit=px,dpi=240"

  }
