package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DigiDragon device specifications for Android Compose previews.
 *
 * This extension provides DigiDragon device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digidragon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digidragon: Any
  get() = object {
      /** DigiDragon DS502 */
      val DS502 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DigiDragon DS571 */
      val DS571 = "spec:width=540,height=1140,unit=px,dpi=240"

      /** DigiDragon DS6018 */
      val DS6018 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DigiDragon DS6261 */
      val DS6261 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DigiDragon 708Z */
      val _708Z = "spec:width=600,height=1024,unit=px,dpi=160"

  }
