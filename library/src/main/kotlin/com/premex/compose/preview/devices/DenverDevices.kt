package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * denver device specifications for Android Compose previews.
 *
 * This extension provides denver device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Denver.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Denver: Any
  get() = object {
      /** denver TIO_80 */
      val TIO_80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** denver TIQ-1044 */
      val TIQ_1044 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** denver TIQ-1049 */
      val TIQ_1049 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** denver TIQ-70 */
      val TIQ_70 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
