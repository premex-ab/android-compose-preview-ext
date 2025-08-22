package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ugee device specifications for Android Compose previews.
 *
 * This extension provides ugee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ugee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ugee: Any
  get() = object {
      /** ugee Hera_Vis_WIFI */
      val HERA_VIS_WIFI = "spec:width=1600,height=2400,unit=px,dpi=320"

      /** ugee ugeeUT1Lite_EEA */
      val UGEEUT1LITE_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** ugee ugeeUT1Lite_NOEEA */
      val UGEEUT1LITE_NOEEA = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
