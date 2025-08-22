package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOW device specifications for Android Compose previews.
 *
 * This extension provides HOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.How.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.How: Any
  get() = object {
      /** HOW HT704 */
      val HT704 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW HT705 */
      val HT705 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW HT-705XS */
      val HT_705XS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW 1001-G */
      val _1001_G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW 1001-G_Go */
      val _1001_G_GO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW 704-G */
      val _704_G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW 705-G */
      val _705_G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOW 705-G_Go */
      val _705_G_GO = "spec:width=600,height=1024,unit=px,dpi=213"

  }
