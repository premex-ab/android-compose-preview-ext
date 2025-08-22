package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * kyocera device specifications for Android Compose previews.
 *
 * This extension provides kyocera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kyocera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kyocera: Any
  get() = object {
      /** kyocera C6530N */
      val C6530N = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6725 */
      val C6725 = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6730 */
      val C6730 = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6740 */
      val C6740 = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6740N */
      val C6740N = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6742 */
      val C6742 = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6742A */
      val C6742A = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6743 */
      val C6743 = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera C6745 */
      val C6745 = "spec:width=540,height=960,unit=px,dpi=240"

      /** kyocera E6560 */
      val E6560 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** kyocera E6560C */
      val E6560C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** kyocera E6560L */
      val E6560L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** kyocera E6560T */
      val E6560T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** kyocera E6762 */
      val E6762 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** kyocera E6782 */
      val E6782 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** kyocera E6790 */
      val E6790 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** kyocera E6790TM */
      val E6790TM = "spec:width=720,height=1280,unit=px,dpi=240"

  }
