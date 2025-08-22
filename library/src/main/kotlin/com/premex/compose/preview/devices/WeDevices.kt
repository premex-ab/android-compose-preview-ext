package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WE device specifications for Android Compose previews.
 *
 * This extension provides WE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.We.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.We: Any
  get() = object {
      /** WE A10 */
      val A10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** WE A50 */
      val A50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** WE F1 */
      val F1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WE L7 */
      val L7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WE V5 */
      val V5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** WE WE_F20 */
      val WE_F20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** WE WE_L9 */
      val WE_L9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** WE WE_R4 */
      val WE_R4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** WE WE_T1 */
      val WE_T1 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
