package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CEPTER device specifications for Android Compose previews.
 *
 * This extension provides CEPTER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cepter.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cepter: Any
  get() = object {
      /** CEPTER burbank */
      val BURBANK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CEPTER CEPTERTAB101 */
      val CEPTERTAB101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CEPTER CEPTERTAB1095 */
      val CEPTERTAB1095 = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** CEPTER CEPTERTAB10E */
      val CEPTERTAB10E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CEPTER CEPTERTABP12 */
      val CEPTERTABP12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** CEPTER CEPTER-TAB-10L */
      val CEPTER_TAB_10L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CEPTER CEPTER-TAB-10S */
      val CEPTER_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CEPTER CTABERA101 */
      val CTABERA101 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** CEPTER CTABEVOP12 */
      val CTABEVOP12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** CEPTER CTABNEXUS */
      val CTABNEXUS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** CEPTER CTABTERRA128 */
      val CTABTERRA128 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CEPTER CTABTERRA256 */
      val CTABTERRA256 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CEPTER CTABTITAN12 */
      val CTABTITAN12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** CEPTER lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CEPTER nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
