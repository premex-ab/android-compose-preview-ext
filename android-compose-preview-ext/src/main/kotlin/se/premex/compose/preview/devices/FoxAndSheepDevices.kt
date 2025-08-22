package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fox_and_Sheep device specifications for Android Compose previews.
 *
 * This extension provides Fox_and_Sheep device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FoxAndSheep.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FoxAndSheep: Any
  get() = object {
      /** Fox_and_Sheep Kidstablet1 */
      val KIDSTABLET1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Fox_and_Sheep KidstabletOne */
      val KIDSTABLETONE = "spec:width=600,height=1024,unit=px,dpi=160"

  }
