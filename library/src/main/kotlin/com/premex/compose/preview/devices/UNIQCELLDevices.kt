package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNIQCELL device specifications for Android Compose previews.
 *
 * This extension provides UNIQCELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNIQCELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNIQCELL: Any
  get() = object {
      /** UNIQCELL UNIQ0122 */
      val UNIQ0122 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** UNIQCELL UNIQCELL_A4 */
      val UNIQCELL_A4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** UNIQCELL UNIQCELL_A55 */
      val UNIQCELL_A55 = "spec:width=480,height=960,unit=px,dpi=213"

  }
