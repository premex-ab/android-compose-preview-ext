package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * tagheuer device specifications for Android Compose previews.
 *
 * This extension provides tagheuer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tagheuer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tagheuer: Any
  get() = object {
      /** tagheuer anthracite */
      val ANTHRACITE = "spec:width=400,height=400,unit=px,dpi=280"

      /** tagheuer glacier */
      val GLACIER = "spec:width=360,height=360,unit=px,dpi=240"

      /** tagheuer orbital */
      val ORBITAL = "spec:width=454,height=454,unit=px,dpi=320"

      /** tagheuer oxygen42 */
      val OXYGEN42 = "spec:width=416,height=416,unit=px,dpi=320"

      /** tagheuer oxygen45 */
      val OXYGEN45 = "spec:width=454,height=454,unit=px,dpi=320"

      /** tagheuer spectralite */
      val SPECTRALITE = "spec:width=390,height=390,unit=px,dpi=320"

  }
