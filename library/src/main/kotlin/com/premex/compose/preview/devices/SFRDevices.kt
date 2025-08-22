package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SFR device specifications for Android Compose previews.
 *
 * This extension provides SFR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SFR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SFR: Any
  get() = object {
      /** SFR DIW377_ALT_FR */
      val DIW377_ALT_FR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SFR DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SFR DV8555-SFR */
      val DV8555_SFR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SFR DV8945-KFS */
      val DV8945_KFS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SFR msm8916_32 */
      val MSM8916_32 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
