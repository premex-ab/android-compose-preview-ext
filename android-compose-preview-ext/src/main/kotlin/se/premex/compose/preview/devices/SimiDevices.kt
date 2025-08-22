package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SIMI device specifications for Android Compose previews.
 *
 * This extension provides SIMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Simi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Simi: Any
  get() = object {
      /** SIMI Mecha */
      val MECHA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** SIMI S501plus-Z */
      val S501PLUS_Z = "spec:width=540,height=960,unit=px,dpi=220"

      /** SIMI S502 */
      val S502 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SIMI S507 */
      val S507 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SIMI S630 */
      val S630 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** SIMI S8001 */
      val S8001 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
