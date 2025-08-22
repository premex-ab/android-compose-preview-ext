package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CipherLab device specifications for Android Compose previews.
 *
 * This extension provides CipherLab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cipherlab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cipherlab: Any
  get() = object {
      /** CipherLab RK25 */
      val RK25 = "spec:width=480,height=800,unit=px,dpi=240"

      /** CipherLab RK25WO */
      val RK25WO = "spec:width=480,height=800,unit=px,dpi=240"

      /** CipherLab RK26 */
      val RK26 = "spec:width=480,height=800,unit=px,dpi=240"

      /** CipherLab RK95 */
      val RK95 = "spec:width=480,height=800,unit=px,dpi=240"

      /** CipherLab RS10 */
      val RS10 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** CipherLab RS31 */
      val RS31 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CipherLab RS35 */
      val RS35 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CipherLab RS36 */
      val RS36 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CipherLab RS38 */
      val RS38 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** CipherLab RS51_HS */
      val RS51_HS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
