package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WestgateResorts device specifications for Android Compose previews.
 *
 * This extension provides WestgateResorts device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Westgateresorts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Westgateresorts: Any
  get() = object {
      /** WestgateResorts T803 */
      val T803 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** WestgateResorts T805 */
      val T805 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
