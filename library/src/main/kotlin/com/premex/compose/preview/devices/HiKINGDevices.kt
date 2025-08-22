package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HiKING device specifications for Android Compose previews.
 *
 * This extension provides HiKING device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HiKING.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HiKING: Any
  get() = object {
      /** HiKING A23 */
      val A23 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HiKING A44 */
      val A44 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** HiKING A46 */
      val A46 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** HiKING A51 */
      val A51 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** HiKING KIDS_1 */
      val KIDS_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HiKING Rugged_S1 */
      val RUGGED_S1 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** HiKING Rugged_S2 */
      val RUGGED_S2 = "spec:width=576,height=1280,unit=px,dpi=240"

  }
