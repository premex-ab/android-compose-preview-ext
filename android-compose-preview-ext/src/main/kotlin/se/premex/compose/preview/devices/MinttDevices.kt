package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MINTT device specifications for Android Compose previews.
 *
 * This extension provides MINTT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mintt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mintt: Any
  get() = object {
      /** MINTT CoolMintt_Blaze_2 */
      val COOLMINTT_BLAZE_2 = "spec:width=480,height=854,unit=px,dpi=200"

      /** MINTT CoolMintt_Rival */
      val COOLMINTT_RIVAL = "spec:width=480,height=1014,unit=px,dpi=220"

      /** MINTT Mintt_M3 */
      val MINTT_M3 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** MINTT MINTT_M5 */
      val MINTT_M5 = "spec:width=480,height=960,unit=px,dpi=220"

      /** MINTT MINTT_T11 */
      val MINTT_T11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MINTT T3 */
      val T3 = "spec:width=800,height=1340,unit=px,dpi=213"

  }
