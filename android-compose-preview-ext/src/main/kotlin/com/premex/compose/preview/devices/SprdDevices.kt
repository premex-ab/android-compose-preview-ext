package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPRD device specifications for Android Compose previews.
 *
 * This extension provides SPRD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sprd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sprd: Any
  get() = object {
      /** SPRD sp7731e_1h10 */
      val SP7731E_1H10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SPRD sp9832a_2h11_volte */
      val SP9832A_2H11_VOLTE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SPRD ums512_1h10 */
      val UMS512_1H10 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
