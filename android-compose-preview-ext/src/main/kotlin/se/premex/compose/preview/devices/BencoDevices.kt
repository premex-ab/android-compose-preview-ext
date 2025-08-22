package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * benco device specifications for Android Compose previews.
 *
 * This extension provides benco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Benco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Benco: Any
  get() = object {
      /** benco AE9010 */
      val AE9010 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** benco AE9110 */
      val AE9110 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** benco AE9120 */
      val AE9120 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** benco AE9150 */
      val AE9150 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** benco AE9230 */
      val AE9230 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** benco AE9240 */
      val AE9240 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** benco AE9250 */
      val AE9250 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** benco AE9260 */
      val AE9260 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** benco AE9310 */
      val AE9310 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** benco AE9950 */
      val AE9950 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** benco AEOP513 */
      val AEOP513 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** benco AEOP517 */
      val AEOP517 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** benco AEOP519 */
      val AEOP519 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** benco AEOP520 */
      val AEOP520 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** benco AEOP523 */
      val AEOP523 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** benco AEOP525 */
      val AEOP525 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** benco AEOP526 */
      val AEOP526 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** benco AF9010_F */
      val AF9010_F = "spec:width=720,height=1520,unit=px,dpi=320"

      /** benco AF9020 */
      val AF9020 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** benco AF9030 */
      val AF9030 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** benco AH9110 */
      val AH9110 = "spec:width=480,height=854,unit=px,dpi=240"

      /** benco AH9210 */
      val AH9210 = "spec:width=480,height=854,unit=px,dpi=240"

      /** benco AH9910 */
      val AH9910 = "spec:width=480,height=854,unit=px,dpi=240"

      /** benco M1000 */
      val M1000 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** benco M700 */
      val M700 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
