package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NECNON device specifications for Android Compose previews.
 *
 * This extension provides NECNON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NECNON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NECNON: Any
  get() = object {
      /** NECNON M002K-2 */
      val M002K_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NECNON M002N-3T */
      val M002N_3T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NECNON M002Q-2 */
      val M002Q_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NECNON M002U_2T */
      val M002U_2T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NECNON 3L-2 */
      val _3L_2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
