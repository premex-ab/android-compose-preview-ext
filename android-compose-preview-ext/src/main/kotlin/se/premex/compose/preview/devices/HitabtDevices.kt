package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * hitabt device specifications for Android Compose previews.
 *
 * This extension provides hitabt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hitabt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hitabt: Any
  get() = object {
      /** hitabt K30A */
      val K30A = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** hitabt P30A */
      val P30A = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** hitabt T30A_SY07PC01 */
      val T30A_SY07PC01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
