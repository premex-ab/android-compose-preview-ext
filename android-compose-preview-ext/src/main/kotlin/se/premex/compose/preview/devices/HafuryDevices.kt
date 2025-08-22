package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HAFURY device specifications for Android Compose previews.
 *
 * This extension provides HAFURY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hafury.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hafury: Any
  get() = object {
      /** HAFURY A7 */
      val A7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** HAFURY G20 */
      val G20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HAFURY GT20 */
      val GT20 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** HAFURY HAFURY_MIX */
      val HAFURY_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HAFURY HAFURY_UMAX */
      val HAFURY_UMAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** HAFURY K30 */
      val K30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HAFURY K30_PRO */
      val K30_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HAFURY M20 */
      val M20 = "spec:width=442,height=960,unit=px,dpi=240"

      /** HAFURY MEET */
      val MEET = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** HAFURY NOTE_10 */
      val NOTE_10 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** HAFURY V1 */
      val V1 = "spec:width=1080,height=2408,unit=px,dpi=400"

  }
