package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EPIKONE device specifications for Android Compose previews.
 *
 * This extension provides EPIKONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Epikone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Epikone: Any
  get() = object {
      /** EPIKONE K406 */
      val K406 = "spec:width=360,height=640,unit=px,dpi=160"

      /** EPIKONE K501 */
      val K501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** EPIKONE K501_Plus */
      val K501_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** EPIKONE K503 */
      val K503 = "spec:width=480,height=854,unit=px,dpi=240"

      /** EPIKONE K503HD */
      val K503HD = "spec:width=720,height=1280,unit=px,dpi=300"

      /** EPIKONE K503S */
      val K503S = "spec:width=480,height=854,unit=px,dpi=213"

      /** EPIKONE K503T */
      val K503T = "spec:width=480,height=854,unit=px,dpi=240"

      /** EPIKONE K504 */
      val K504 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EPIKONE K506 */
      val K506 = "spec:width=480,height=854,unit=px,dpi=220"

      /** EPIKONE K511 */
      val K511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EPIKONE K536 */
      val K536 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EPIKONE K545 */
      val K545 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EPIKONE K546 */
      val K546 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EPIKONE K600 */
      val K600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EPIKONE K601 */
      val K601 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EPIKONE K604 */
      val K604 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** EPIKONE K605 */
      val K605 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** EPIKONE TX1000 */
      val TX1000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EPIKONE TX800 */
      val TX800 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** EPIKONE X410 */
      val X410 = "spec:width=360,height=640,unit=px,dpi=160"

      /** EPIKONE X430 */
      val X430 = "spec:width=360,height=640,unit=px,dpi=165"

      /** EPIKONE X515 */
      val X515 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** EPIKONE X516 */
      val X516 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** EPIKONE X547 */
      val X547 = "spec:width=480,height=960,unit=px,dpi=213"

      /** EPIKONE X572 */
      val X572 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EPIKONE X610 */
      val X610 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** EPIKONE X618 */
      val X618 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** EPIKONE X620 */
      val X620 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** EPIKONE X650 */
      val X650 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** EPIKONE X655 */
      val X655 = "spec:width=720,height=1600,unit=px,dpi=300"

  }
