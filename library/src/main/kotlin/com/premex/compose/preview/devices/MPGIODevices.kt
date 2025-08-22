package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MPGIO device specifications for Android Compose previews.
 *
 * This extension provides MPGIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MPGIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MPGIO: Any
  get() = object {
      /** MPGIO ATHENA_A10 */
      val ATHENA_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MPGIO IKP104 */
      val IKP104 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** MPGIO Legend_A */
      val LEGEND_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MPGIO LEGEND_NEW7 */
      val LEGEND_NEW7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MPGIO MAT10221 */
      val MAT10221 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MPGIO MAT10421 */
      val MAT10421 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MPGIO MAT80211B */
      val MAT80211B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MPGIO MID */
      val MID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MPGIO MLT156001 */
      val MLT156001 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** MPGIO MLT703824 */
      val MLT703824 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MPGIO MPGIO_10 */
      val MPGIO_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MPGIO MPGIO_8 */
      val MPGIO_8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
