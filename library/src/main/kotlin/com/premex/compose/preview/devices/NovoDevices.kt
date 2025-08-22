package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOVO device specifications for Android Compose previews.
 *
 * This extension provides NOVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Novo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Novo: Any
  get() = object {
      /** NOVO t596_dp_n_37m35 */
      val T596_DP_N_37M35 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
