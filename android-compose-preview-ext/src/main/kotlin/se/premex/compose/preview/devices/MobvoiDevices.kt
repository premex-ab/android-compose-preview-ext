package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * mobvoi device specifications for Android Compose previews.
 *
 * This extension provides mobvoi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobvoi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobvoi: Any
  get() = object {
      /** mobvoi catfish */
      val CATFISH = "spec:width=400,height=400,unit=px,dpi=280"

      /** mobvoi catfish_ext */
      val CATFISH_EXT = "spec:width=400,height=400,unit=px,dpi=280"

      /** mobvoi catshark */
      val CATSHARK = "spec:width=400,height=400,unit=px,dpi=280"

      /** mobvoi mooneye */
      val MOONEYE = "spec:width=400,height=400,unit=px,dpi=280"

      /** mobvoi rubyfish */
      val RUBYFISH = "spec:width=454,height=454,unit=px,dpi=320"

      /** mobvoi skipjack */
      val SKIPJACK = "spec:width=360,height=360,unit=px,dpi=280"

      /** mobvoi tunny */
      val TUNNY = "spec:width=400,height=400,unit=px,dpi=280"

  }
