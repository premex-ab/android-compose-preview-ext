package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UBNT device specifications for Android Compose previews.
 *
 * This extension provides UBNT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ubnt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ubnt: Any
  get() = object {
      /** UBNT capri_ubq_telefi5 */
      val CAPRI_UBQ_TELEFI5 = "spec:width=640,height=960,unit=px,dpi=240"

      /** UBNT capri_ubq_telefi5p */
      val CAPRI_UBQ_TELEFI5P = "spec:width=640,height=960,unit=px,dpi=240"

      /** UBNT capri_ubq_telefi7 */
      val CAPRI_UBQ_TELEFI7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
