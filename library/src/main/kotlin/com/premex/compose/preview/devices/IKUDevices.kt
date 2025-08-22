package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iKU device specifications for Android Compose previews.
 *
 * This extension provides iKU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IKU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IKU: Any
  get() = object {
      /** iKU A10 */
      val A10 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** iKU A21 */
      val A21 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iKU A23 */
      val A23 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iKU A35 */
      val A35 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** iKU A36 */
      val A36 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU A45 */
      val A45 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** iKU A50 */
      val A50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU A6 */
      val A6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** iKU A70 */
      val A70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU iKU_A22 */
      val IKU_A22 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** iKU T1 */
      val T1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iKU T6 */
      val T6 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iKU T8 */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** iKU X1 */
      val X1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU X2 */
      val X2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU X3 */
      val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU X4 */
      val X4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iKU X5 */
      val X5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iKU Y2 */
      val Y2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** iKU Y3 */
      val Y3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** iKU Y7 */
      val Y7 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
