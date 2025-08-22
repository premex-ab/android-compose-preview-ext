package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART device specifications for Android Compose previews.
 *
 * This extension provides SMART device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMART.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMART: Any
  get() = object {
      /** SMART Advance_Pro */
      val ADVANCE_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SMART Coral_4 */
      val CORAL_4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SMART e-PAD */
      val E_PAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART groundhog */
      val GROUNDHOG = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SMART komodo */
      val KOMODO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SMART M20 */
      val M20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** SMART M30 */
      val M30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SMART M50 */
      val M50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SMART Slide_Lite */
      val SLIDE_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
