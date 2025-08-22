package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGIT device specifications for Android Compose previews.
 *
 * This extension provides DIGIT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIGIT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIGIT: Any
  get() = object {
      /** DIGIT Digit_Glory1 */
      val DIGIT_GLORY1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DIGIT DIGIT_INFINITY */
      val DIGIT_INFINITY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DIGIT DIGIT_INFINITY_MAX */
      val DIGIT_INFINITY_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DIGIT NOTE_14 */
      val NOTE_14 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DIGIT NOTE_20 */
      val NOTE_20 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
