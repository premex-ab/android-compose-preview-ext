package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEXIBOOK device specifications for Android Compose previews.
 *
 * This extension provides LEXIBOOK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LEXIBOOK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LEXIBOOK: Any
  get() = object {
      /** LEXIBOOK LT10 */
      val LT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LEXIBOOK LT10EN_09 */
      val LT10EN_09 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LEXIBOOK LT10_01_EEA */
      val LT10_01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LEXIBOOK MFS100 */
      val MFS100 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LEXIBOOK TL70 */
      val TL70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LEXIBOOK TLN10FR */
      val TLN10FR = "spec:width=800,height=1280,unit=px,dpi=213"

  }
