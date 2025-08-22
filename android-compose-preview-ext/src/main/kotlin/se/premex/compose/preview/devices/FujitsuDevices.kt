package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FUJITSU device specifications for Android Compose previews.
 *
 * This extension provides FUJITSU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fujitsu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fujitsu: Any
  get() = object {
      /** FUJITSU arrowsM05 */
      val ARROWSM05 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** FUJITSU arrowsRX */
      val ARROWSRX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** FUJITSU BZ01 */
      val BZ01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** FUJITSU FARTM933KZ */
      val FARTM933KZ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUJITSU M01 */
      val M01 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU M01T */
      val M01T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUJITSU M02 */
      val M02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU M03 */
      val M03 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU M04 */
      val M04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU M04P */
      val M04P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU M357 */
      val M357 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU M555 */
      val M555 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUJITSU mx532 */
      val MX532 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** FUJITSU Patio600 */
      val PATIO600 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** FUJITSU TONEm17 */
      val TONEM17 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FUJITSU YM901FJ */
      val YM901FJ = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
