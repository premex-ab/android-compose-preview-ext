package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MARVUE device specifications for Android Compose previews.
 *
 * This extension provides MARVUE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Marvue.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Marvue: Any
  get() = object {
      /** MARVUE Kidpa_M7 */
      val KIDPA_M7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MARVUE M11 */
      val M11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MARVUE M12 */
      val M12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MARVUE M15 */
      val M15 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MARVUE M8 */
      val M8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MARVUE M81 */
      val M81 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MARVUE M8_Pro */
      val M8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MARVUE Pad_M10 */
      val PAD_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MARVUE Pad_M30 */
      val PAD_M30 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
