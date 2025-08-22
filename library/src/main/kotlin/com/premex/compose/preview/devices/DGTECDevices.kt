package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DGTEC device specifications for Android Compose previews.
 *
 * This extension provides DGTEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DGTEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DGTEC: Any
  get() = object {
      /** DGTEC DG101SVCB */
      val DG101SVCB = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DGTEC DG101TBLS */
      val DG101TBLS = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DGTEC DG7TBIPSPA */
      val DG7TBIPSPA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DGTEC DGIPS7 */
      val DGIPS7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
