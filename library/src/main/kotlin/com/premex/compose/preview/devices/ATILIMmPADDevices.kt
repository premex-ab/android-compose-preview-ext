package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATILIM_mPAD device specifications for Android Compose previews.
 *
 * This extension provides ATILIM_mPAD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATILIMmPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATILIMmPAD: Any
  get() = object {
      /** ATILIM_mPAD ATILIM_mPAD07 */
      val ATILIM_MPAD07 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
