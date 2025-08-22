package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RugGear device specifications for Android Compose previews.
 *
 * This extension provides RugGear device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RugGear.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RugGear: Any
  get() = object {
      /** RugGear PSM01E */
      val PSM01E = "spec:width=640,height=1136,unit=px,dpi=320"

      /** RugGear RG540 */
      val RG540 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** RugGear RG650 */
      val RG650 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** RugGear RG655 */
      val RG655 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** RugGear RG725 */
      val RG725 = "spec:width=640,height=1136,unit=px,dpi=320"

      /** RugGear RG750_EEA */
      val RG750_EEA = "spec:width=640,height=1136,unit=px,dpi=320"

      /** RugGear RG750_ROW */
      val RG750_ROW = "spec:width=640,height=1136,unit=px,dpi=320"

      /** RugGear RG850 */
      val RG850 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** RugGear RG880 */
      val RG880 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** RugGear RG910 */
      val RG910 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** RugGear RG930i */
      val RG930I = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** RugGear RG935 */
      val RG935 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
