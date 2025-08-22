package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BRANDT device specifications for Android Compose previews.
 *
 * This extension provides BRANDT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brandt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brandt: Any
  get() = object {
      /** BRANDT OD0M_EA_T32 */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BRANDT R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BRANDT R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BRANDT R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BRANDT R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BRANDT takao */
      val TAKAO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BRANDT vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
