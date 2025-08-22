package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATEC device specifications for Android Compose previews.
 *
 * This extension provides ATEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATEC: Any
  get() = object {
      /** ATEC APD3 */
      val APD3 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** ATEC ATEC_IWB */
      val ATEC_IWB = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
