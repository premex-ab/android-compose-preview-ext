package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * open_fhd_ATV device specifications for Android Compose previews.
 *
 * This extension provides open_fhd_ATV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OpenFhdAtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OpenFhdAtv: Any
  get() = object {
      /** open_fhd_ATV open_fhd_ap */
      val OPEN_FHD_AP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** open_fhd_ATV open_fhd_sa */
      val OPEN_FHD_SA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
